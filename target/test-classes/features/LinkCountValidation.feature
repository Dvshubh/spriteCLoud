Feature: Check that the links on the UITAP tab and the Home tab have the same number

Scenario: Verify the links count available in UITAP tab and Home tab is matching or not

Given User is available on UI Test Automation landing page

When User clicks on UITAP tab

And User clicks on Home tab

Then Links available in UITAP tab and Home tab shiuld have the same count.