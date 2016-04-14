### READ ME ###

This is it! The code is mostly on MainActivity and SecondActivity (0 naming sense). Let me explain the process a bit, and warnings later.
First, when you enter the activity, there is a onClick event on the layout to make sure you can start just by tapping the screen.
It was mostly done thinking about "what if I could use the fingerprint thing"... but in the end, it just starts an intent to another activity. Pretty simple.

Second, and here come the warnings, there is the second screen with a password field and a save button.
How it works: EditText with a Button. The button has a method indicated in the activity. The method asks for the sharedPref variable (sharedPreferences!), which will then save a key/value (the password!). I decided to use the R.id.password for the key because.... creativeness. The button will show a Toast on onClick, and will show a toast (!!!) as soon as you enter the second activity if there is something different from "" saved.

As for the warning: You can't actually see the password (since it was specified as a password), but you can see the number of stars/asterisks..right? Since it makes no sense to save the asterisks and not the string itself, I decided to just... save the string itself. Without encryptation. (BAD IDEA NORMALLY!)

I could've used a few methods or anything else just to do the encryption, but I'd lose the ability to actually *see* the asterisks, and then I'd have to save the number of asterisks to make sure you can 'see' 'the password'.