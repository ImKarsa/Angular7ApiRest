import { Injectable, EventEmitter } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class ModalService {

  modal: boolean = false;
  // parad diferenciar un atributo de sus metodos get y set
  // su nombre empieza por _
  private _notificarUpload = new EventEmitter<any>();

  constructor() { }

  get notificarUpload(): EventEmitter<any> {
    return this._notificarUpload;
  }

  abrirModal() {

    this.modal = true;

  }

  cerrarModal() {

    this.modal = false;

  }
}
