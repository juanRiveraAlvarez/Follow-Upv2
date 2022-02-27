import React, { useState } from 'react';
import axios from 'axios';
import cookie from 'universal-cookie';

import config from '../config/constantes';
import '../style/login.css';


const Login = () => {

    const [mail, setMail] = useState<string>("");
    const [password, setPassword] = useState<string>("");

    const cookies = new cookie();

    const handleSubmit = async(event: React.FormEvent) => {
        event.preventDefault();
        const {status, data} = await axios.post(config.SERVER.URL+'auth',{
            "email": mail,
            "password": password,
        });
        if (status == 202){
          cookies.set('token',data.token);
        }
    }

    return (
        <>
            <form onSubmit={handleSubmit}>
                <div className="container">
                    <input
                        type="email"
                        placeholder="Enter Email"
                        name="email"
                        value={mail}
                        onChange={(e) => setMail(e.target.value)} required />
                    <input
                        type="password"
                        placeholder="Enter Password"
                        name="psw"
                        value={password}
                        onChange={(e) => setPassword(e.target.value)} required />
                    <button type="submit">Login</button>
                </div>
            </form>
        </>
    )
}

export default Login;
