import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms'; // Asegúrate de agregar esta línea
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AlumnoComponent } from './alumno/alumno.component';
import { AlumnoService } from './alumno.service';
import { HttpClientModule } from '@angular/common/http';
import { CursoComponent } from './curso/curso.component';
import { RouterModule, Routes } from '@angular/router';
import { PreguntasComponent } from './preguntas/preguntas.component';
import { ExamenComponent } from './examen/examen.component';
const routes: Routes = [
  { path: 'alumnos', component: AlumnoComponent },
  { path: 'cursos', component: CursoComponent },
  { path: 'examenes', component: ExamenComponent },
  { path: '', redirectTo: '/cursos', pathMatch: 'full' }, // Redireccionar a 'alumnos' por defecto
];
@NgModule({

  declarations: [
    AppComponent,
    AlumnoComponent,
    CursoComponent,
    PreguntasComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    AppRoutingModule,
    HttpClientModule ,// Asegúrate de agregar HttpClientModule aquí
    FormsModule // Asegúrate de agregar FormsModule aquí
  ],
  providers: [ AlumnoService],
  bootstrap: [AppComponent],
  exports: [RouterModule]
})
export class AppModule { }
