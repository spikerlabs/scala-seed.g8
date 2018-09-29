@hello-world
Feature: Hello World
  In order to confirm that template is working
  As the author
  I want greeter to compile and return expected result

  Scenario: Greet Bob
    Given my name is "Bob"
    When I pass it to the greeter
    Then the greeter should have returned "Hello, Bob!"