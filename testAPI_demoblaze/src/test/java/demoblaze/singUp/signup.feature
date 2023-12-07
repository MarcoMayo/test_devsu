# new feature
# Tags: optional

Feature: Post Sing Up

  Background:
    * url api.baseurl
    * path path = "signup"
    * def responseFailed = read("signUp-error.json")

  Scenario: Sign Up successfully
    Given request { username: '#(user.name)', password: 'dGVzdDAy' }
    When method post
    Then status 200
    And match header Content-Length == '3'

  Scenario: Sign Up failed
    Given request { username: 'Test_bat_02', password: 'dGVzdDAy' }
    When method post
    Then status 200
    And match $ == responseFailed

