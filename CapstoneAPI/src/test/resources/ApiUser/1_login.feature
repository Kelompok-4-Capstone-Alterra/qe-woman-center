Feature: Login
    @test1
    Scenario Outline: As a user I am able to login with valid data
        Given I set user login endpoint
        When I send user POST request with "<username>" and "<password>"
        Then Success login and receive response with a token
        Examples:
            | username   | password                          |
            | ivandev    | 98af8f4b100d11eea4f10242ac180003  |

    @test2
    Scenario Outline: As a user I am not able to login with invalid data
        Given I set user login endpoint
        When I send user POST request with "<username>" and "<password>"
        Then I fail user login and receive response code 400
        Examples:
            | username  | password  |
            | vokot1234 | password1 |
            | vokot123  | password  |
            | vokot1234 | password  |
