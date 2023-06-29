import { BaseEntity } from "src/app/shared/state/base-entity.mode";
import { Address } from "./address.module";

export class Customer extends BaseEntity {
    userName: string;
    password: string;
    firstName: string;
    lastName: string;
    email: string;
    phoneNumber: string;
    address: Address;
  }
  