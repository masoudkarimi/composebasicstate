# State in Compose

App's **"state"** is any value that can change over time and encompasses everything from a Room
database to a variable in a class.

**State** determines what is shown in the UI at any particular time. 

Any action that causes the modification of state is called **event**.

**Events** are inputs generated from outside or inside of the app such as:
- User interaction with the app, for example pressing a button
- Other factors, such as sensors sending new values, or network responses

**While the state of the app offers a description of what to display in the UI, events are the
mechanism through which the state changes, resulting in changes to the UI.**

## State is. Event happen

Creating an updated UI by re-executing composable functions => this is called **recomposition** 

**The Composition:** a description of the UI built by Jetpack Compose when it executes composables.

**Initial composition:** creation of a Composition by running composables the first time.

**Recomposition:** re-running composables to update the Composition when data changes.


The output of the Composition is a **tree-structure** that describes the UI.

## Remember vs. RememberSaveable

**remember**: Retain state across recomposition

**rememberSaveable**: Retained  across configuration changes



