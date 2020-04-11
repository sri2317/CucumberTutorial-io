package com.api.cucumber.stepdfn;

import java.util.List;

import com.api.cucumber.transform.User;
import com.api.cucumber.transform.UserDetails;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDfn {
	
	@Given("^User is at the login page of the application$")
	public void user_is_at_the_login_page_of_the_application() throws Throwable {
	}

	@When("^User login with the following username and password$")
	public void user_login_with_the_following_username_and_password(DataTable table) throws Throwable {
	/*	List<List<String>> data=  table.raw();
		for(List<String> str : data){
			for(String str1 : str){
				System.out.println("Data : " + str1);
			}
		}*/
		
		/*Map<String, String> data = table.asMap(String.class, String.class);
		
		for(String key : data.keySet()){
			System.out.println(String.format("Key : %s , Value : %s", key,data.get(key)));
		}*/
		
		/*List<String> dataList = table.asList(String.class);
		
		for(String key : dataList){
			System.out.println(String.format("Value : %s", key));
		}*/
		
		List<User> userList = table.asList(User.class);
		
		for(User user : userList){
			System.out.println(user.toString());
		}
		
	}
	
	@When("User login with the following username password and Address")
	public void user_login_with_the_following_username_password_and_Address(io.cucumber.datatable.DataTable dataTable) {
		
		List<UserDetails> userDetailList = dataTable.asList(UserDetails.class);
		
		for (UserDetails userDetails : userDetailList) {
			System.out.println(userDetails.toString());
		}
		
	}
	
	@When("^User login with the following username and password with data in excel at \"([^\"]*)\"$")
	public void user_login_with_the_following_username_and_password_with_data_in_excel_at(DataTable table) throws Throwable {
		System.out.println(table.toString());
		
		List<String> dataList = table.asList(String.class);
		
		for(String str : dataList){
			System.out.println(str);
		}
		
	}
	

	@Then("^User should be able to login with correct username and password$")
	public void user_should_be_able_to_login_with_correct_username_and_password() throws Throwable {
	}
	
	
	@Given("^a precondition has value \"([^\"]*)\"$")
	public void a_precondition_has_value(String arg1) throws Throwable {
	   System.out.println(String.format("Value : %s", arg1));
	}

	@Given("^something with \"([^\"]*)\"$")
	public void something_with(String arg1) throws Throwable {
		 System.out.println(String.format("Value : %s", arg1));
	}

	@Then("^check \"([^\"]*)\" is the output$")
	public void check_is_the_output(String arg1) throws Throwable {
		 System.out.println(String.format("Value : %s", arg1));
	}
	

}
