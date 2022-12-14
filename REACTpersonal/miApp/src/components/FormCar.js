import React from "react";
import BotonFormulario from "./ButtonForm";


const FormCar = () => {
  return (
    <form class="row g-3">

      <div class="col-md-6">
        <label for="inputEmail4" class="form-label">
          Marca
        </label>
        <input
          type="text"
          class="form-control"
          id="inputEmail4"
          placeholder="Ingrese la marca del auto aqui"
        />
      </div>

      <div class="col-md-6">
        <label for="inputEmail4" class="form-label">
          Patente
        </label>
        <input
          type="text"
          class="form-control"
          id="inputEmail4"
          placeholder="Ingrese la patente del auto aqui"
        />
      </div>
      <div class="col-md-6">
        <label for="inputEmail4" class="form-label">
          Numero de inscripcion
        </label>
        <input
          type="text"
          class="form-control"
          id="inputEmail4"
          placeholder="Ingrese el numero de inscripcion aqui"
        />
      </div>
      <div class="col-md-6">
        <label for="inputEmail4" class="form-label">
          Año
        </label>
        <input
          type="text"
          class="form-control"
          id="inputEmail4"
          placeholder="Ingrese el año de su auto aqui"
        />
      </div>
      <div class="col-md-6">
        <label for="inputPassword4" class="form-label">
            Pais de origen
        </label>
        <input
          type="text"
          class="form-control"
          id="inputPassword4"
          placeholder="Ingrese aqui el pais de origen del auto"
        />
      </div>



      <div class="col-12">
      <BotonFormulario infoBoton={'Agregar auto'}/>
                <br/>
      </div>

    </form>
  );
};

export default FormCar;
