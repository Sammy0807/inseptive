package com.example.sentinel

class HomeFeed(val videos: List<Video>)

class Video(val id: Int,
            val name: String,
            val link: String,
            val imageUrl: String,
            val numberOfViews: Int,
            val channel: Channel)

class Channel(val name: String, val profileImageUrl: String)

class CourseLesson(val name: String, val duration: String, val number: Int, val imageUrl: String, val link: String)

//"name": "Creating a Registration Screen",
//"duration": "21:50",
//"number": 1,
//"imageUrl": "https://letsbuildthatapp-videos.s3-us-west-2.amazonaws.com/d6938a65-b273-421b-976a-40cf923a17ba_thumbnail",
//"link": "https://www.letsbuildthatapp.com/course_video?id=1022"