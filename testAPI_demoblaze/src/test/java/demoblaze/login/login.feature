# new feature
# Tags: optional

Feature: Post Log In

  Background:
    * url api.baseurl
    * path path = "login"
    * def responseFailed = read("login-error.json")

  Scenario: Log In successfully
    Given request { username: 'Test_bat_02', password: 'dGVzdDAy' }
    When method post
    Then status 200
    And match $ contains "Auth_token: "

  Scenario: Log In error
    Given request { username: 'Test_ba', password: 'dGVzdDAy' }
    When method post
    Then status 200
    And match $ == responseFailed