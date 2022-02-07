package hn.edu.ujcv.pdm_2022_i_i1_2016110174

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.view.View
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spnElement)
        val lista = listOf("Dispositivos Moviles","Programacion 1","Programacion 2")
        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,lista)
        spinner.adapter = adaptador


    }


}
class MainActivity2 : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun showBasicDialog(view: View?){
    val builder = AlertDialog.Builder(this)
        builder.setTitle("Alert")
        builder.setMessage("Bienvenido")
        builder.show()
    }

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etTime.setOnClickListener { showTimePickerDialog() }
    }
    private fun showTimePickerDialog() {
        val timePicker = TimePickerFragment { onTimeSelected(it) }
        timePicker.show(supportFragmentManager, "timePicker")
    }
    private fun onTimeSelected(time: String) {
        etTime.setText("Reserva para las $time")
    }
}
