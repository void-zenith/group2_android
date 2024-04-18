package com.zenith.group2_finalproject.navigation

 sealed class Routes(val route: String) {
    object IntroPage : Routes("IntroPage")
    object HomePage : Routes("HomePage")
    object SpeechToTextPage : Routes("SpeechToTextPage")
    object TextToSpeechPage : Routes("TextToSpeechPage")
    object FileListPage : Routes("FileListPage")
}