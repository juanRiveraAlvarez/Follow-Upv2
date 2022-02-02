import React from "react";

const Register = () => {

    const [mail, setMail] = useState("");
    const [password, setPassword] = useState("");
    const [userName, setUserName] = useState("");

    const Service = (event) => {
        event.preventDefault();
        LoginService(mail, password);
    }

    return (
        <>
            <form onSubmit={Service}>
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
    );
}

export default Register;