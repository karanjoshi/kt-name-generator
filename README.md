# kt-name-generator

#### Problem Statement 
Create logic for testing screen names and test that names using Junit Testing functions.

Generate layout name, controller name, and model name according to the given technology.

There will be 2 inputs: Technology and Screen Name

Technology: Android, Flutter, and iOS.

Screen Name can be of type String.

The generated name should not contain the following:

Number.

Space.

Special Chars.

At least use 4-5 test functions.

check Empty

check Null

check Type

screen name sample: 123Test$%

screen name sample: @#test;'

Example:

Consider screen name = "Splash Screen" for the following example.

if technology = Android, generate the following things as Output:

layout name ➝ activity_splash_screen.

controller name ➝ SplashScreenActivity.

model name ➝ SplashScreenModel.

if technology = Flutter, generate the following things as Output:

layout name ➝ splash_screen

controller name ➝ splash_controller.

model name ➝ splash_model.

if technology = iOS, generate following things as Output:

view name ➝ SplashScreenView.

viewmodel name ➝ SplashScreenViewModel.

#### Implementation

1. remove noise characters from the screen name using regular expressions

2. find and match against name patterns and generate name 

#### How to run

Pass input in CLI with format `technology` `screen name`

`technology` - `android` `ios` `flutter`
