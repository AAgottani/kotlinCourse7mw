package com.reiscompsvm.sevenminutes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.reiscompsvm.sevenminutes.databinding.ActivityExerciseActvitiyBinding

class ExerciseActvitiy : AppCompatActivity() {

    private var binding: ActivityExerciseActvitiyBinding?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityExerciseActvitiyBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }


}