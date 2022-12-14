import React, { useCallback, useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import BotonFormulario from "./ButtonForm";

const initialUsuario = {
  id: "",
  nombreDueño: "",
  marcaAuto: "",
  patente: "",
};

const FormUser = ({ userAdd, usuarioEditado, setUsuarioEditado, userEdit }) => {
  const [usuario, setUsuario] = useState(initialUsuario);
  const { id, nombreDueño, marcaAuto, patente } = usuario;

  const navigate = useNavigate();
  const handleOnClick = useCallback(() => navigate("/Auto", {}, [navigate]));

  useEffect(() => {
    if (usuarioEditado !== null) {
      setUsuario(usuarioEditado);
    } else {
      setUsuario({
        id: "",
        nombreDueño: "",
        marcaAuto: "",
        patente: "",
      });
    }
  }, [usuarioEditado]);

  const handleInputChange = (e) => {
    const changedFormValue = {
      ...usuario,
      [e.target.name]: e.target.value,
    };

    setUsuario(changedFormValue);
  };

  return (
    <form class="row g-3">
      {usuarioEditado !== null ? (
        <h1>Editar usuario</h1>
      ) : (
        <h1>Ingrese Usuario</h1>
      )}

      <div class="col-md-6">
        <label for="inputNombre" class="form-label">
          ID
        </label>
        <input
          type="text"
          class="form-control"
          id="inputID"
          placeholder="Ingrese cualquier numero aqui"
          name="id"
          value={id}
          onChange={handleInputChange}
        />
      </div>

      <div class="col-md-6">
        <label for="inputNombre" class="form-label">
          Nombre
        </label>
        <input
          type="text"
          class="form-control"
          id="inputNombreDueño"
          placeholder="Ingrese su nombre aqui"
          name="nombreDueño"
          value={nombreDueño}
          onChange={handleInputChange}
        />
      </div>
      <div class="col-md-6">
        <label for="inputNombre" class="form-label">
          Marca de su auto
        </label>
        <input
          type="text"
          class="form-control"
          id="inputMarcaAuto"
          placeholder="Ingrese la marca de su auto aqui"
          name="marcaAuto"
          value={marcaAuto}
          onChange={handleInputChange}
        />
      </div>

      <div class="col-md-6">
        <label for="inputNombre" class="form-label">
          Patente
        </label>
        <input
          type="text"
          class="form-control"
          id="inputPatente"
          placeholder="Ingrese la patente de su auto aqui"
          name="patente"
          value={patente}
          onChange={handleInputChange}
        />
      </div>
      {usuarioEditado !== null ? (
        <button
          type="button"
          class="btn btn-success"
          onClick={() => userEdit(usuario)}
        >
          Editar usuario
        </button>
      ) : (
        <button
          type="button"
          class="btn btn-success"
          onClick={() => userAdd(usuario)}
        >
          Ingresar usuario
        </button>
      )}

      {usuarioEditado !== null ? (
        <button
          type="button"
          class="btn btn-danger"
          onClick={() => setUsuarioEditado(null)}
        >
          Cancelar
        </button>
      ) : (
        <></>
      )}
    </form>
  );
};

export default FormUser;
