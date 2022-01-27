import React, { useState } from 'react';
import LoginService from '../Service/login';
import '../style/login.css';

const Login = () => {

    const [mail, setMail] = useState("");
    const [password, setPassword] = useState("");

    const Service = () => {
        LoginService(mail, password)
    }

    return (
        <div>
            <form onSubmit={Service}>
                <div className="container">
                    <input type="email" placeholder="Enter Email" name="email" required />
                    <input type="password" placeholder="Enter Password" name="psw" required />
                    <button type="submit">Login</button>
                </div>
            </form>
        </div>
    )
}

export default Login;