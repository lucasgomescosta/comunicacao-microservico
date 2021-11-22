import User from '../model/User.js';

class UserRepository {
    async findById(id) {
        try {
            return await User.findOne({ where: id })
        } catch (error) {
            console.log(error)
        }
    }

    async findByEmail(email) {
        try {
            return await User.findOne({ where: email })
        } catch (error) {
            console.log(error)
        }
    }
}

export default new UserRepository();