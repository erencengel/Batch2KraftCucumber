# go to Amazon
# enter only harf
# verify that there is a sort button

# go to Amazon
# enter only sayılar
# verify that there is a sort button

# go to Amazon
# enter only characters
# verify that there is a sort button
  @amazon
  Feature: Amazon.com için arama özelliği doğrulama
    Scenario Outline: arama özelliği
      Given the user is on the homepage
      When the user enters "<differentCharacter>" into the search bar
      And click on the search button
      Then verify that home papge has a sortBy tag

      Examples:
      |differentCharacter|
      |abc  |
      |12345|
      |*!.  |
