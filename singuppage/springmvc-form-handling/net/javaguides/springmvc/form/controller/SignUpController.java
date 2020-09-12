package net.javaguides.springmvc.form.controller;

public class SignUpController {
	
	@Controller
	public class SignUpController {

	    /**
	     * Create new signUpForm object for empty from
	     * 
	     * @return
	     */
	    @ModelAttribute("signUpForm")
	    public SignUpForm setSignUpForm() {
	        return new SignUpForm();
	    }

	    /**
	     * Method to show the initial HTML form
	     * 
	     * @return
	     */
	    @GetMapping("/showSignUpForm")
	    public String showForm() {
	        return "signup-form";
	    }

	    /**
	     * Save User sign up form
	     * 
	     * @param signUpForm
	     * @param model
	     * @return
	     */
	    @PostMapping("/saveSignUpForm")
	    public String saveUser(@ModelAttribute("signUpForm") SignUpForm signUpForm, Model model) {

	        // Implement business logic to save user details into a database
	        // .....

	        System.out.println("FirstName : " + signUpForm.getFirstName());
	        System.out.println("LastName : " + signUpForm.getLastName());
	        System.out.println("Username : " + signUpForm.getUserName());
	        System.out.println("Password : " + signUpForm.getPassword());
	        System.out.println("Email : " + signUpForm.getEmail());

	        model.addAttribute("message", "User SignUp successfully.");
	        model.addAttribute("user", signUpForm);

	        return "signup-success";
	    }
	}

}
