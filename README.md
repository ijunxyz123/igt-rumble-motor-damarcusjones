# IGT Rumble Motor Control Demo

There is a rumble motor in Infinity Game Table (IGT) where you can control via our SDK to enhance your game's experience. This project is a demo showing how to control the rumble motor on IGT.

Running this sample project, you will see a simple Seekbar and Button screen:  

![Alt text](/doc/screen.png?raw=true "Rumble motor demo")

Use the slider to adjust rumble duration (in milliseconds), press the RUMBLE button to trigger the motor.

## Integrate the IGT SDK
1. Get the AAR library at ```app/libs/igtsdk.aar```
2. Import the AAR library to your Android project.
3. Make sure you have included the library in your dependencies setup in gradle
    ```
    compile (name: 'igtsdk', ext:'aar')
    ```

## Rumble Motor
1. Import the package
    ```
    import com.arcade1up.igtsdk.IGTMotor;
    ```
2. Rumble for x milliseconds  
    ```
    IGTMotor.rumble(x);
    ```

## License (TBD)

Copyright 2021 Tastemakers, LLC

This project is licensed under the terms of the [Apache 2.0](http://www.apache.org/licenses/LICENSE-2.0) open source license. 
