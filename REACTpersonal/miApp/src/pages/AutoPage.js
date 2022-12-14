import React, {useCallback} from "react";
import { useNavigate } from "react-router-dom";
import { BotonFormulario, FormCar} from "../components";

const AutoPage = () => {
    const navigate = useNavigate();
    const handleOnClick = useCallback(()=> navigate("/", {}, [navigate]))
  return (
    <div class="container mt-3">
      <h1>Ingrese los datos de su auto</h1>
      <div class="row">
        <div class="col">
          <FormCar />
        </div>
      </div>
      <BotonFormulario infoBoton={"Ir a Usuario"} handleOnClick={handleOnClick}/>
      <hr />
      <div class="row">
        <div class="col">
        </div>
      </div>
    </div>
  );
};

export default AutoPage;