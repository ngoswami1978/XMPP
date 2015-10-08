package com.neerajweb.mygcmproject;

public interface Config {

	// used to share GCM regId with application server - using php app server
	//static final String APP_SERVER_URL = "http://192.168.1.17/gcm/gcm.php?shareRegId=1";

	//static final String APP_SERVER_URL = "https://gentle-dusk-8464.herokuapp.com/PushNotificationPHP.php?shareRegId=1";

	static final String APP_SERVER_URL = "http://www.myandroidng.com/Apartment/Pushnotificationlakshay.php?shareRegId=1";



	// GCM server using java
	// static final String APP_SERVER_URL =
	// "http://192.168.1.17:8080/GCM-App-Server/GCMNotification?shareRegId=1";

	// Google Project Number
	static final String GOOGLE_PROJECT_ID = "677629339095";

	//static final String GOOGLE_PROJECT_ID = "myprojectgcm-1079";
	static final String MESSAGE_KEY = "m";


/* please refer thr Pushnotification.php PHP code the following line of code is sending the push nofification message
and here $message = array("m" => $pushMessage);
m is the MESSAGE_KEY

	<?php
			//this block is to post message to GCM on-click
			$pushStatus = "";
	if(!empty($_GET["push"])) {
		$gcmRegID  = file_get_contents("GCMRegId.txt");
		$pushMessage = $_POST["message"];
		if (isset($gcmRegID) && isset($pushMessage)) {
			$gcmRegIds = array($gcmRegID);
			$message = array("m" => $pushMessage);
			$pushStatus = sendPushNotificationToGCM($gcmRegIds, $message);
		}
	}

	//this block is to receive the GCM regId from external (mobile apps)
	if(!empty($_GET["shareRegId"])) {
		$gcmRegID  = $_POST["regId"];
		file_put_contents("GCMRegId.txt",$gcmRegID);
		echo "Ok!";
		exit;
	}
	?>

*/
	//AIzaSyBUXg3AZR0wGgGTs9GIaYQ0OFEPFibLNzg
	//677629339095


}
