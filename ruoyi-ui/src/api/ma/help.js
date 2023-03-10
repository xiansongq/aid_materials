import request from '@/utils/request'

// 查询求助列表
export function listHelp(query) {
  return request({
    url: '/ma/help/list',
    method: 'get',
    params: query
  })
}

//查询登录用户的求助列表

export function mylistHelp(query) {
  return request({
    url: '/ma/help/mylist',
    method: 'get',
    params: query
  })
}

//查询登录用户 提供帮助的列表
//查询登录用户的求助列表

export function myedlistHelp(query) {
  return request({
    url: '/ma/help/myedlist',
    method: 'get',
    params: query
  })
}

// 查询求助详细
export function getHelp(hid) {
  return request({
    url: '/ma/help/' + hid,
    method: 'get'
  })
}

// 新增求助
export function addHelp(data) {
  return request({
    url: '/ma/help',
    method: 'post',
    data: data
  })
}

// 修改求助
export function updateHelp(data) {
  return request({
    url: '/ma/help',
    method: 'put',
    data: data
  })
}

// 删除求助
export function delHelp(hid) {
  return request({
    url: '/ma/help/' + hid,
    method: 'delete'
  })
}
