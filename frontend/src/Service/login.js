import axios from 'axios';
import config from '../config/constantes';

const LoginService = async(mail,password)=>{
    const {data} = await axios.get(config.SERVER.URL+'login'+'/'+mail+'/'+password);
    console.log(config.SERVER.URL+'login'+'/'+mail+'/'+password)
    console.log(data.message)
}

export default LoginService;