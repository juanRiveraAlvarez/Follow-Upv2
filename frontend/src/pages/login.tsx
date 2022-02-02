import React, { useState } from 'react';
import LoginService from '../Service/login';
import '../style/login.css';

const Login = () => {

    const [mail, setMail] = useState<string>("");
    const [password, setPassword] = useState<string>("");

    const handleSubmit = (event: React.FormEvent) => {
        event.preventDefault();
        LoginService(mail, password);
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
                            onChange={(e) => setPassword(e.target.value)}required />
                    <button type="submit">Login</button>
                </div>
            </form>
        </>
    )
}

export default Login;
