fun foo() {
    var x = 0
    <!CAN_BE_REPLACED_WITH_OPERATOR_ASSIGNMENT{LT}!><!ASSIGNED_VALUE_IS_NEVER_READ!>x<!> <!CAN_BE_REPLACED_WITH_OPERATOR_ASSIGNMENT{PSI}!>=<!> 1 + x<!>
}
