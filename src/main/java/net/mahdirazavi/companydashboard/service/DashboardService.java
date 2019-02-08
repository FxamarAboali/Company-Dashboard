package net.mahdirazavi.companydashboard.service;

import net.mahdirazavi.companydashboard.entity.*;

import java.util.HashMap;
import java.util.List;

public interface DashboardService {

    List<CompanyRevenue> getTodayRevenueDashSimple();

    HashMap<String,Object> getTodayRevenueDash();

    List<ProductCategory> getBestCategory();

    List<OrderReceived> getAllOrderReceived();

    List<OrderCollectionStatus> getOrderCollection();

    List<EmployeeInformation> getAllEmployee();

    EmployeeInformation addEmployee(EmployeeInformation employeeInformation);

    EmployeeInformation getEmployee(final String pk);

    EmployeeInformation updateEmployee(EmployeeInformation employeeInformation);

    void deleteEmployee(EmployeeInformation employeeInformation);

}