package com.dprk.infokids51

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_back_it.*

class BackItActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_back_it)

        var textEmail: String
        var inputName = ""
        var inputCity = ""
        var inputAdres = ""
        var inputEmail = ""
        var inputWeb = ""
        var inputCallNumber =""
        var inputInfo = ""
        var errorSendEmail = false

        outlinedTextFieldName.editText?.doOnTextChanged { inputText, _, _, _ ->
            inputName = inputText.toString()
            val counter = inputText?.length
            Log.d("INPUT TAG", "inputName=${inputName} count=$counter")
            if (counter != null) {
                if (counter > outlinedTextFieldName.counterMaxLength) {
                    outlinedTextFieldName.error = "Превышена допустимая длина текста"
                    errorSendEmail = true
                } else {
                    outlinedTextFieldName.error = null
                    errorSendEmail = false
                }
            }
        }

        outlinedTextFieldCity.editText?.doOnTextChanged { inputText, _, _, _ ->
            inputCity = inputText.toString()
            Log.d("INPUT TAG", "inputCity=${inputCity}")
        }

        outlinedTextFieldAdres.editText?.doOnTextChanged { inputText, _, _, _ ->
            inputAdres = inputText.toString()
            Log.d("INPUT TAG", "inputCity=${inputAdres}")
        }

        outlinedTextFieldEmail.editText?.doOnTextChanged { inputText, _, _, _ ->
            inputEmail = inputText.toString()
            Log.d("INPUT TAG", "inputEmail=${inputEmail}")
        }

        outlinedTextFieldWeb.editText?.doOnTextChanged { inputText, _, _, _ ->
            inputWeb = inputText.toString()
            Log.d("INPUT TAG", "inputWeb=${inputWeb}")
        }

        outlinedTextFieldCallNumber.editText?.doOnTextChanged { inputText, _, _, _ ->
            inputCallNumber = inputText.toString()
            Log.d("INPUT TAG", "inputCallNumber=${inputCallNumber}")
        }

        outlinedTextFieldInfo.editText?.doOnTextChanged { inputText, _, _, _ ->
            inputInfo = inputText.toString()
            val counter = inputText?.length
            Log.d("INPUT TAG", "inputCity=${inputInfo} count=$counter")
            if (counter != null) {
                if (counter > outlinedTextFieldInfo.counterMaxLength) {
                    outlinedTextFieldInfo.error = "Превышена допустимая длина текста"
                    errorSendEmail = true
                } else {
                    outlinedTextFieldInfo.error = null
                    errorSendEmail = false
                }
            }
        }

        sendButton.setOnClickListener(){
            textEmail = "Name: $inputName\nCity: $inputCity\nAdres: $inputAdres\nEmail: $inputEmail\nWeb: $inputWeb\nCallNumber: $inputCallNumber\nInfo: $inputInfo"
            if (!errorSendEmail) {
                sendEmail(textEmail)
            } else{
                Toast.makeText(this, "Ошибка в заполнении формы", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun sendEmail(textEmail: String) {

        val sendEmail: Intent = Intent(Intent.ACTION_SEND).apply {
            // The intent does not have a URI, so declare the "text/plain" MIME type
            type = "text/plan"
            putExtra(Intent.EXTRA_EMAIL, arrayOf("20dprk20@gmail.com")) // recipients
            putExtra(Intent.EXTRA_SUBJECT, "Добавить, редактировать")
            putExtra(Intent.EXTRA_TEXT, textEmail)
            // You can also attach multiple items by passing an ArrayList of Uris
        }

        sendEmail.data = Uri.parse("mailto:")

        startActivity(sendEmail)
    }
}