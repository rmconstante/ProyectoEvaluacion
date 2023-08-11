import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AlumnoComponent } from './alumno/alumno.component';
import { AppComponent } from './app.component';
import { CursoComponent } from './curso/curso.component';
import { PreguntasComponent } from './preguntas/preguntas.component';
import { ExamenComponent } from './examen/examen.component';
const routes: Routes = [
  { path: 'alumnos', component: AlumnoComponent },
  { path: 'cursos', component: CursoComponent },
  { path: 'examenes', component: ExamenComponent },
  { path: '', redirectTo: '/cursos', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
