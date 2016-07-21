package com.buris.example.texttospeech;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnInitListener {

	private TextToSpeech repeatTTS;
//	Button btnspeakout;
//	EditText edtTexttoSpeak;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		btnspeakout = (Button) findViewById(R.id.btnspeakout);
//		edtTexttoSpeak = (EditText) findViewById(R.id.edtTexttoSpeak);
		repeatTTS = new TextToSpeech(this, this);

//		btnspeakout.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				 repeatTTS.speak(edtTexttoSpeak.getText().toString(),
//				 TextToSpeech.QUEUE_FLUSH, null);
//			}
//		});
	}

	public void getFalar(View v) {
		 repeatTTS.speak("vire a esquerda a pokemon na ceu", TextToSpeech.QUEUE_FLUSH, null);

	}

	@Override
	public void onInit(int arg0) {
		// TODO Auto-generated method stub
	}

}
