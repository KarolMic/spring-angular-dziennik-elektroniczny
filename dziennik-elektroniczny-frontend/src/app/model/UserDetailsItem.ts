import {UserType} from './UserType';

export class UserDetailsItem {

  type: UserType;
  userName: string;
  email: string;
  name: string;
  surName: string;
  clazz: string

  constructor(type: UserType, userName: string, email: string, name: string, surName: string, clazz: string) {
    this.type = UserType[type];
    this.userName = userName;
    this.email = email;
    this.name = name;
    this.surName = surName;
    this.clazz = clazz;
  }
}
