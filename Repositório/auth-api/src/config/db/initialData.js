import bcrypt from 'bcrypt';
import User from '../../modules/user/model/User';

export async function createIniitialData() {
    try {
        await User.sync({ force: true });

        let password = await bcrypt.hash('123456');

        await User.create({
            name: 'User test',
            email: 'teste@gmail.com',
            password
        })
    } catch (error) {
        console.log(error)
    }  
}
