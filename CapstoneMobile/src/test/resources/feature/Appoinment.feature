@Appointment
Feature: Appointment
  As a user
  I want to make appointment
  So that can consultation with counselor

  @MakeAppointmentWithScheduleUnavailable
  Scenario: Make Appointment with schedule Unavailable
    Given I login app women center
    When I input valid credential login
      | Username       | Password     |
      | kangtesting    | 12345678     |
    And I click counseling button
    And I choose topic counseling
    And I click continue button
    And I choose counselor
    Then I cant make appointment because schedule Unavailable

  @GuestMakeAppointment
  Scenario: Guest Can't make appointment because not login to app
    Given Guest on the homepage button for make appointment
    And Guest click counseling button
    And Guest choose topic counseling
    And Guest click continue button
    And Guest choose counselor
    Then Guest redirected to the login page for make appointment