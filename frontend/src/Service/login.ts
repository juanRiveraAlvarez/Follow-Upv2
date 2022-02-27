import axios from 'axios';
import config from '../config/constantes';

const LoginService = async(mail:string,password:string)=>{
  try{
    const {data} = await axios.post(config.SERVER.URL+'auth',{
      "email": mail,
      "password": password,
    });
    return data
  }catch(error){
    return "not found"
  }
}

export default LoginService;
