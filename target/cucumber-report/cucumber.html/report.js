$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/DeleteItemFromBasket.feature");
formatter.feature({
  "line": 1,
  "name": "Delete item from shopping cart",
  "description": "As a user I should be able to delete an item from the shopping cart",
  "id": "delete-item-from-shopping-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 18561637900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to delete an item from shopping cart successfully",
  "description": "",
  "id": "delete-item-from-shopping-cart;user-should-be-able-to-delete-an-item-from-shopping-cart-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "There is an item already inside my basket",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on Shopping cart",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on delete button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User can verify banner message \"Your shopping cart is empty.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteItemSteps.thereIsAnItemAlreadyInsideMyBasket()"
});
formatter.result({
  "duration": 5117712900,
  "status": "passed"
});
formatter.match({
  "location": "DeleteItemSteps.userClicksOnShoppingCart()"
});
formatter.result({
  "duration": 262070200,
  "status": "passed"
});
formatter.match({
  "location": "DeleteItemSteps.userClicksOnDeleteButton()"
});
formatter.result({
  "duration": 174860600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your shopping cart is empty.",
      "offset": 32
    }
  ],
  "location": "DeleteItemSteps.userCanVerifyBannerMessage(String)"
});
formatter.result({
  "duration": 88625800,
  "status": "passed"
});
formatter.after({
  "duration": 1751552000,
  "status": "passed"
});
});