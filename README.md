# Books4All
This app was made using Android Studio (using Java as the programming language) and Firebase Authentication which provides backend services, easy-to-use SDKs, and inbuilt UI libraries to authenticate users to our app. It also enables us to use custom claims which we’ve leveraged to build a flexible role-based API. 

But the main idea of the app is that to help elderly people enjoy their love of reading without having to strain their eyes. We've used text to speech technology which allows the users to understand the information in a way that makes content easier to retain and provides an option for content consumption on the go, taking content away from the screen and into an environment that's convenient for the consumer.

![Splash Screen](https://user-images.githubusercontent.com/76071184/146198829-819fa150-990f-4ec9-a1b4-88e34e061dec.PNG)   ![Book Selected](https://user-images.githubusercontent.com/76071184/146199051-f94b6bdc-995f-4f64-bebd-c065b93fbbc4.PNG)

# Android Studio
Android Studio is Android's official IDE. It is purpose-built for Android to accelerate your development and help you build the highest-quality apps for every Android device.

![Android Studio](https://user-images.githubusercontent.com/76071184/146199855-59ef4a9d-6821-4c81-b449-68aa5effdbde.PNG)

# Firebase Authentication
Most apps need to know the identity of a user. Knowing a user's identity allows an app to securely save user data in the cloud and provide the same personalized experience across all of the user's devices.

Firebase Authentication provides backend services, easy-to-use SDKs, and ready-made UI libraries to authenticate users to your app. It supports authentication using passwords, phone numbers, popular federated identity providers like Google, Facebook and Twitter, and more.

Firebase Authentication integrates tightly with other Firebase services, and it leverages industry standards like OAuth 2.0 and OpenID Connect, so it can be easily integrated with your custom backend.

You can sign in users to your Firebase app either by using FirebaseUI as a complete drop-in auth solution or by using the Firebase Authentication SDK to manually integrate one or several sign-in methods into your app.

**How does it work?**

To sign a user into our app, we first get authentication credentials from the user. These credentials can be the user's email address and password, or an OAuth token from a federated identity provider. Then, these credentials are passed to the Firebase Authentication SDK. The backend services will then verify those credentials and return a response to the client.

After a successful sign in, we can access the user's basic profile information, and can control the user's access to data stored in other Firebase products. We can also use the provided authentication token to verify the identity of users.

![Firebase](https://user-images.githubusercontent.com/76071184/146200050-531cfc38-55db-41a5-9afe-2ab63fabd052.jpg)


# Text to Speech Technology 
Text-to-speech (TTS) is a type of assistive technology that reads digital text aloud. It's sometimes called “read aloud” technology. With a click of a button or the touch of a finger, TTS can take words on a computer or other digital device and convert them into audio.

**In Android Studio:**

Android allows you convert your text into voice. Not only you can convert it but it also allows you to speak text in variety of different languages.

Android provides TextToSpeech class for this purpose. In order to use this, we need to instantiate an object of this class and also specify the **initListener**.
  
