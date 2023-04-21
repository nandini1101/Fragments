package com.example.ffragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.ffragments.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClock = findViewById<Button>(R.id.btnClock)
        val buttonExam = findViewById<Button>(R.id.btnExam)
        val buttonValidate = findViewById<Button>(R.id.btnValidate)

        buttonClock.setOnClickListener {
            replaceFrameWithFragments(Clock_Fragment())
        }

        buttonExam.setOnClickListener {
            replaceFrameWithFragments(Exam_fragment())
        }

        buttonValidate.setOnClickListener {
            replaceFrameWithFragments(LoginFragment())
        }
    }

    private fun replaceFrameWithFragments(frag: Fragment) {

        val fragManager = supportFragmentManager
        val fragmentTransaction = fragManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,frag)
        fragmentTransaction.commit()
    }
}