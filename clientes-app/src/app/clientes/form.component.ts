import { Component, OnInit } from '@angular/core';
import { Cliente } from './cliente';
import { ClienteService } from './cliente.service';
import { Router, ActivatedRoute } from '@angular/router';
import swal from 'sweetalert2';
import { Region } from './region';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html'
})
export class FormComponent implements OnInit {

  private cliente: Cliente = new Cliente();
// tslint:disable-next-line: no-inferrable-types
  private titulo: string = 'Crear Cliente';
  private regiones: Region[];
  private errores: string[];

  constructor(private clienteService: ClienteService,
              private router: Router,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    this.cargarCliente();
  }

  cargarCliente(): void {
    this.activatedRoute.params.subscribe(params => {
      // tslint:disable-next-line: prefer-const
      let id = params.id;
      if (id) {
        this.clienteService.getCliente(id).subscribe( (cliente) => this.cliente = cliente);
      }
    });

    this.clienteService.getRegiones().subscribe(regiones =>
      this.regiones = regiones);
  }

  create(): void {
    this.clienteService.create(this.cliente)
    .subscribe( cliente => {
      this.router.navigate(['/clientes']);
      swal.fire('Nuevo cliente', `El cliente ${cliente.nombre} ha sido creado don exito`, 'success');
      },
      err => {
        this.errores = err.error.error as string[];
        console.error('Codigo del error desde el backend: ' + err.status);
        console.error(err.error.error);
      }
    );
  }

  update(): void {
    this.clienteService.update(this.cliente)
      .subscribe( json => {
        this.router.navigate(['/clientes']);
        swal.fire('Cliente Actualizado', `${json.mensaje}: ${json.cliente.nombre}`, 'success');
      },
      err => {
        this.errores = err.error.error as string[];
        console.error('Codigo del error desde el backend: ' + err.status);
        console.error(err.error.error);
      }
      );
  }

  compararRegiones(o1: Region, o2: Region) {

    if (o1 === undefined && o2 === undefined) {
      return true;
    }
    return o1 == null || o2 == null ? false : o1.id === o2.id;

  }

}
