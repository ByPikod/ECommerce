# Databases

* Accounts
    * ID -> Number
    * Name -> Text
    * Last Name -> Text
    * E-Mail -> Text
    * Password -> Text

* Sessions
    * Unique Session ID -> Number
    * Token -> Text
    * When Session Created -> Number, Text or Date

* Products
    * ID -> Number
    * Image -> Text
    * Name -> Text
    * Description -> Text
    * Price -> Number
    * Stock -> Number
      * Commenter ID -> Number
      * Rate -> Number
      * Message -> Text

* Cart
    * ID -> Number
    * Account ID -> Number
    * Product ID -> Number

* Orders
    * ID -> Number
    * Orderer ID -> Number
    * Product ID -> Number
    * Amount -> Number
    * Address -> Text