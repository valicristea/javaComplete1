package ro.scoala_informala.javaComplete1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ro.scoala_informala.javaComplete1.model.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mvc/customers")
public class CustomerMvcController {
    private List<Customer> customerList =  new ArrayList<>();

    public CustomerMvcController() {
        customerList.addAll(List.of(new Customer(15, "Popescu", null),
                new Customer(16, "toni", null)));
    }

    @PostMapping
    public String createCustomer(@ModelAttribute Customer customer, Model model) {
        customerList.add(customer);

        //goes to the view
        model.addAttribute("customerList", customerList);
        model.addAttribute("date", LocalDate.now().toString());
        return "/customer/list";
    }

    @GetMapping("/create")
    @ResponseStatus(value = HttpStatus.CREATED)
    public String  getCreateCustomerForm() {
        return "/customer/createCustomerForm";
    }





    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerList;
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") Integer id) {
        return customerList.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Customer with id " + id + " does not exist"));
    }

    @PatchMapping("/{id}")
    public Customer updateCustomer(@PathVariable("id") Integer id, @RequestParam String newName) {
        Customer customer = customerList.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Customer with id " + id + " does not exist"));

        customer.setName(newName);
        return customer;
    }

    //TODO ADD DELETE CUSTOMER ENDPOINT



}
