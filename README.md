## Running the Selenium Java Project

Follow these steps to run the Selenium Java project on your local machine:

1. **Prerequisites**:
   
   - **Java Development Kit (JDK)**: Ensure that you have Java JDK installed on your computer.

2. **Open the Project**:

   Use an Integrated Development Environment (IDE) like Eclipse or IntelliJ IDEA to open the cloned project.

3. **Configure WebDriver**:

   Make sure the project's WebDriver configuration is set correctly. You may need to update the WebDriver path or the browser driver (ChromeDriver in this case) based on your system.

4. **Resolve Dependencies**:

   - The project uses Maven, open a terminal/command prompt, navigate to the project's root directory, and run `mvn clean install` to download and install project dependencies.
   - Or when using eclipse, go to project then click clean to downaload and install project dependencies.

5. **Run the Tests**:

   In your IDE, locate the test class or test suite that you want to run. Right-click on it and select "Run" or "Debug" depending on your preference then click "TestNG Test".

6. **View Test Results**:

   The test results will be displayed in the IDE's test runner. You can view the test pass/fail status and any error messages in the output.

