package com.neerajweb.mygcmproject;

public interface Config {

	// used to share GCM regId with application server - using php app server
	//static final String APP_SERVER_URL = "http://192.168.1.17/gcm/gcm.php?shareRegId=1";

	static final String APP_SERVER_URL = "http://192.168.94.116/PushNotificationPHP.php?shareRegId=1";

	// GCM server using java
	// static final String APP_SERVER_URL =
	// "http://192.168.1.17:8080/GCM-App-Server/GCMNotification?shareRegId=1";

	// Google Project Number
	static final String GOOGLE_PROJECT_ID = "677629339095";

	//static final String GOOGLE_PROJECT_ID = "myprojectgcm-1079";
	static final String MESSAGE_KEY = "message";


	//AIzaSyBUXg3AZR0wGgGTs9GIaYQ0OFEPFibLNzg
	//677629339095


}
