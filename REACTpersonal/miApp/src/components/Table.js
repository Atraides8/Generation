import React from "react";

const TableUserCar = ({usuarios, deleteUser, setUsuarioEditado}) => {
  return (
    <table class="table">
      <thead>
        <tr>
          <th scope="col">#</th>
          <th scope="col">Nombre dueño auto</th>
          <th scope="col">Marca auto</th>
          <th scope="col">Patente</th>
          <th scope="col">Acciones</th>
        </tr>
      </thead>
      <tbody>
                {//Iteramos usuarios con .map, a cada elemento de usuarios lo llamaremos
         //usuario y realizaremos lo siguiente =>
        }
        {usuarios.map((usuario) => (
          <tr>
            <td>{usuario.id}</td>
            <td>{usuario.nombreDueño}</td>
            <td>{usuario.marcaAuto}</td>
            <td>{usuario.patente}</td>
            <td>

              <td
            class="btn-group"
            role="group"
            aria-label="Basic mixed styles example"
          >
            <button type="button" class="btn btn-success" onClick={()=>{
              setUsuarioEditado(usuario);
            }}>

              Editar
            </button>
            <button type="button" class="btn btn-warning">
              Mover
            </button>
            <button
                type="button"
                class="btn btn-danger"
                onClick={() => {
                  deleteUser(usuario.patente);
                }}
              >
              Eliminar
            </button>
          </td>

            </td>
          </tr>
        ))}

      </tbody>
    </table>
  );
};

export default TableUserCar;
