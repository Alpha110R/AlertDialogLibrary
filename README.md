# AlertDialogLibrary


[![](https://jitpack.io/v/Alpha110R/AlertDialogLibrary.svg)](https://jitpack.io/#Alpha110R/AlertDialogLibrary)

## Setup
Step 1. Add it in your root build.gradle at the end of repositories:
```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

Step 2. Add the dependency:
```
dependencies {
  implementation 'com.github.Alpha110R:AlertDialogLibrary:1.00.01'
}
```
## Usage

##### Simple Usage
```java

// For AlertDialog -
       Utils.showAlertDialog(this,
                          "TITLE",  //Title
                          "Message",//Message Text
                          "OK",     //Positive Button Text
                          "CANCEL", //Negative Button Text
                          0,        //Icon Reasorce Id
                new AlertDialogManager.AlertDialogListener() {  //AlertDialog Listener
                            @Override
                            public void onPositiveClick() {
                                Toast.makeText(MainActivity.this, "Clicked OK",Toast.LENGTH_SHORT).show();
                            }
                
                            @Override
                            public void onNegativeClick() {
                                Toast.makeText(MainActivity.this, "Clicked CANCEL",Toast.LENGTH_SHORT).show();
                
                            }
                });

```
## What's new ?

1.00.01:

## License

Copyright 2023 Alon Ronder

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
