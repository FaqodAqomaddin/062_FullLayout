package com.example.project_weatherapp

import android.os.Bundle
import android.os.Message
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.createFontFamilyResolver
import androidx.compose.ui.text.font.emptyCacheFontFamilyResolver
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_weatherapp.ui.theme.Project_WeatherAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project_WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ){
        Text(
            text = "FAQOD AQOMADDIN")

        Spacer(modifier = Modifier.padding(13.dp))

        StatusBox()

        Spacer(modifier = Modifier.padding(13.dp))

        LocnTemp()

        Spacer(modifier = Modifier.padding(13.dp))

        Keterangan()
    }
}

@Composable
fun StatusBox(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(20.dp))
        .background(color = Color.Cyan)){

        Column (
            modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
            Image(painter = painterResource(id = R.drawable.background), contentDescription = null,
                modifier = Modifier.size(200.dp))
        }
    }
}

@Composable
fun LocnTemp(){
    Text(text = "21°C", fontWeight = FontWeight.Bold, fontSize = 64.sp)
    Row (verticalAlignment = Alignment.CenterVertically){
        Image(painter = painterResource(id = R.drawable.location), contentDescription = null )
        Spacer(modifier = Modifier.padding(3.dp))
        Text(text = "Yogyakarta", fontSize = 30.sp)
    }
    Spacer(modifier = Modifier.padding(13.dp))
    Text(text = "Kasihan, Bantul, Daerah Istimewa Yogyakarta", fontSize = 20.sp,color = Color.Gray, textAlign = TextAlign.Center)
}

@Composable
fun Keterangan(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(25.dp))
        .background(color = Color.Cyan)){

        Row {
            Text(text = "Humidity")
            Text(text = "Sunrise")
        }
        Column {
            Text(text = "UV Index")
            Text(text = "Sunset")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Project_WeatherAppTheme {
        HomeScreen()
    }
}