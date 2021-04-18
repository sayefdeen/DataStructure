'use strict';

const Node = require('./Node');

class Stack {
  constructor() {
    this.top = null;
  }

  push(data) {
    const node = new Node(data);
    if (!this.top) {
      this.top = node;
      return this;
    }
    node.next = this.top;
    this.top = node;
    return this;
  }

  pop() {
    const removed = this.top.data;
    this.top = this.top.next;
    return removed;
  }

  peek() {
    return this.top.data;
  }

  display() {
    let output = '';
    let current = this.top;
    while (current) {
      output += `${current.data} --> `;
      current = current.next;
    }
    return output;
  }

  isEmpty() {
    return this.top ? false : true;
  }

  length() {
    let counter = 0;
    let current = this.top;
    while (current) {
      counter++;
      current = current.next;
    }
    return counter;
  }
}

module.exports = Stack;
