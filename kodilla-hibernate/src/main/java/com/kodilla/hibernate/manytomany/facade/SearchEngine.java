package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class SearchEngine {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchEngine.class);

    public List<String> findCompany(final String partOfCompanyName) throws SearchingProcessingException {
        boolean wasError = false;
        List<String> answerList = new ArrayList<>();
        LOGGER.info("Registering new search, question: " + partOfCompanyName);
        List<Company> resultList = companyDao.findCompaniesByNameContaining(partOfCompanyName);
        if (resultList.size() < 1) {
            LOGGER.error(SearchingProcessingException.ERR_COMPANY_NOT_FOUND);
            wasError = true;
            throw new SearchingProcessingException(SearchingProcessingException.ERR_COMPANY_NOT_FOUND);
        } else {
            LOGGER.info("Found answer about: " + partOfCompanyName);
            for (Company company : resultList) {
                answerList.add(String.valueOf(company.getId()) + " ," + company.getName());
            }
            LOGGER.info("Answer is: " + answerList);
            return answerList;
        }
    }
    public List<String> findEmployee(final String partOfEmployeeName) throws SearchingProcessingException {
        boolean wasError=false;
        List<String> answerList = new ArrayList<>();
        LOGGER.info("Registering new search, question: " + partOfEmployeeName);
        List<Employee> lastNameList = employeeDao.findEmployeesByLastnameContaining(partOfEmployeeName);
        List<Employee> firstNameList = employeeDao.findEmployeesByFirstnameContaining(partOfEmployeeName);
        if(lastNameList.size()<1&&firstNameList.size()<1) {
            LOGGER.error(SearchingProcessingException.ERR_EMPLOYEE_NOT_FOUND);
            wasError = true;
            throw new SearchingProcessingException(SearchingProcessingException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            LOGGER.info("Found answer about: " + partOfEmployeeName);
            for (Employee employee : lastNameList) {
                answerList.add(String.valueOf(employee.getId())+" ,"+employee.getLastname());
            }
            for (Employee employee : firstNameList) {
              if(!lastNameList.contains(employee))  {
                  answerList.add(String.valueOf(employee.getId())+" ,"+employee.getLastname());
              }
            }
            LOGGER.info("Answer is: " + answerList);
            return answerList;
        }
    }
}
