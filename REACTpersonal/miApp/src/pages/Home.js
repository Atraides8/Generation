import React, { useCallback, useState } from "react";
import { FormUser, TextComponent } from "../components";
import TableUserCar from "../components/Table";
import BotonFormulario from "../components/ButtonForm";
import { useNavigate } from "react-router-dom";

const usuario1 =[
    {
    id:1,
    nombreDueño:'Joseph',
    marcaAuto:'StarMachine',
    patente:'20201',
},
{   id:2,
    nombreDueño:'Joseph',
    marcaAuto:'Maquina300',
    patente:'30302',
},
{   id:3,
    nombreDueño:'Joseph',
    marcaAuto:'Joestar',
    patente:'1039302',
},

]


const HomePage = () => {
    const navigate = useNavigate();
    const handleOnClick = useCallback(()=> navigate("/Auto", {}, [navigate]))
    const [user, setUser] = useState(usuario1);
    const [usuarioEditado, setUsuarioEditado] = useState(null);

    const userDelete = (patenteUsuario) =>{
        const changeUser = user.filter(usuario => usuario.patente != patenteUsuario);
        setUser(changeUser);
    }

    const userAdd = (usuario) => {
        const addUsuario = [

            ...user,
            usuario,
        ];

        setUser(addUsuario);

    };

    const userEdit = (usuarioEditado) =>{
        const editUser = user.map(usuario => (usuario.rut === usuarioEditado.rut ? usuarioEditado : usuario))

        setUser(editUser);
        
    }


    return(
        <div>
            <TextComponent/>
            
            <FormUser
            userAdd={userAdd}
            usuarioEditado={usuarioEditado}
            setUsuarioEditado={setUsuarioEditado}
            userEdit={userEdit} />
            <br></br>
            <br></br>
            <h3>Usuarios inscritos</h3>
            <br></br>
            <BotonFormulario infoBoton={'Ir a autos'} handleOnClick={handleOnClick}/>
            <br></br>
            <TableUserCar usuarios = {user} deleteUser = {userDelete} setUsuarioEditado={setUsuarioEditado}/>
        </div>
        
    )
}

export default HomePage;