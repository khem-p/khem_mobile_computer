# Canvas (Prac_1)

This Android application demonstrates how to use the `Canvas` and `Paint` classes to perform custom drawing on a `View`.

## Features
- Draws a **Line** in Blue with a stroke width of 25.
- Draws a **Rectangle** (Stroke only) in Red.
- Draws a **Circle** (Filled) in Yellow.
- Draws an **Oval** in Magenta.
- Draws custom **Text** in Gray with a size of 75.

## Screenshot
<p align="center">
  <img src="Screenshot_20260312_212922.png" width="50%" />
</p>

## Project Structure
- `MainActivity.java`: Initializes and sets the `Exam` view as the content.
- `Exam.java`: A custom `View` class that overrides `onDraw()` to perform the drawing operations.

## How to Run
1. Open the project in Android Studio.
2. Build and run the app on an emulator or a physical device.
3. You will see various geometric shapes and text rendered on the screen.
